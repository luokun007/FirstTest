import React, { Component } from "react";
import aixos from "axios";
import { Card, Table, Divider } from "antd";
import { Button } from "antd";

class User extends Component {
  constructor(props) {
    super(props);
    this.state = {
      infos: []
    };
  }
  componentDidMount() {
    aixos.get("http://localhost:8080/spring/query").then(res => {
      console.log(res.data);
      this.setState({
        infos: res.data
      });
    });
  }
  deleteData(userid) {
    aixos.get("http://localhost:8080/spring/dele/" + userid).then(() => {
      this.componentDidMount();
    });
  }

  render() {
    const columns = [
      // {
      //   title: "用户ID",
      //   dataIndex: "userid"
      // },
      {
        title: "用户名称",
        dataIndex: "username"
      },
      {
        title: "用户密码",
        dataIndex: "password"
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
              onClick={this.deleteData.bind(this, record.userid)}
            >
              删除
            </Button>
          </span>
        )
      }
    ];
    return (
      <div>
        <Card title={"用户信息"}>
          <Table columns={columns} dataSource={this.state.infos} bordered />
        </Card>
      </div>
    );
  }
}
export default User;
