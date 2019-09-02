import React, { Component } from "react";
import aixos from "axios";
import { Card, Table, Divider } from "antd";
import { Button } from "antd";

class UserRole extends Component {
  constructor(props) {
    super(props);
    this.state = {
      infos: []
    };
  }
  componentDidMount() {
    aixos.get("http://localhost:8080/spring03/query02").then(res => {
      console.log(res.data);
      this.setState({
        infos: res.data
      });
    });
  }

  deleteData(id) {
    aixos.get("http://localhost:8080/spring03/dele/" + id).then(() => {
      this.componentDidMount();
    });
  }

  render() {
    const columns = [
      // {
      //   title: "ID",
      //   dataIndex: "id"
      // },
      {
        title: "用户名称",
        dataIndex: "username"
      },
      {
        title: "角色名称",
        dataIndex: "rolename"
      },
      {
        title: "操作",
        key: "action",
        render: (text, record) => (
          <span>
            <Button type="primary" onClick={this.editData}>
              编辑
            </Button>
            <Divider type="vertical" />
            <Button
              type="danger"
              onClick={this.deleteData.bind(this, record.id)}
            >
              删除
            </Button>
          </span>
        )
      }
    ];
    return (
      <div>
        <Card title={"用户角色信息"}>
          <Table columns={columns} dataSource={this.state.infos} bordered />
        </Card>
      </div>
    );
  }
}

export default UserRole;
