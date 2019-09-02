import React, { Component } from "react";
import aixos from "axios";
import { Card, Table, Divider } from "antd";
import { Button } from "antd";

class Role extends Component {
  constructor(props) {
    super(props);
    this.state = {
      infos: []
    };
  }
  componentDidMount() {
    aixos.get("http://localhost:8080/spring02/query").then(res => {
      console.log(res.data);
      this.setState({
        infos: res.data
      });
    });
  }
  deleteData(roleid) {
    aixos.get("http://localhost:8080/spring02/dele/" + roleid).then(() => {
      this.componentDidMount();
    });
  }

  render() {
    const columns = [
      // {
      //   title: "角色ID",
      //   dataIndex: "roleid"
      // },
      {
        title: "角色名称",
        dataIndex: "rolename"
      },
      {
        title: "操作",
        key: "action",
        render: (text, record) => (
          <span>
            <Button type="primary" onClick={this.editData} type="primary">
              编辑
            </Button>
            <Divider type="vertical" />
            <Button
              type="danger"
              onClick={this.deleteData.bind(this, record.roleid)}
            >
              删除
            </Button>
          </span>
        )
      }
    ];
    return (
      <div>
        <Card title={"角色信息"}>
          <Table columns={columns} dataSource={this.state.infos} bordered />
        </Card>
      </div>
    );
  }
}

export default Role;
