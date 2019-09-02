import React, {Component} from 'react';
import {HashRouter ,Route, Link, Switch} from 'react-router-dom';
import {Layout, Menu} from 'antd';
import User from '../component/page/user.js';
import Role from '../component/page/role.js';
import userRole from '../component/page/userRole.js';

const {Header, Sider, Content, Footer} = Layout;
const MenuItem = Menu.Item;

class App extends Component{
    render(){
        return <HashRouter>
            <Layout className='cl-layout'>
            <Sider width='240px'>
            <Menu theme='dark'>
                <MenuItem><Link to='/user' >用户表</Link>&nbsp;&nbsp;</MenuItem>
                <MenuItem><Link to='/role' >角色表</Link>&nbsp;&nbsp;</MenuItem>  
                <MenuItem><Link to='/userRole'>用户角色表</Link></MenuItem>  
            </Menu>                   
            </Sider>
            <Content>
            <Switch>
                <Route path='/user' exact component={User} />
                <Route path='/role' exact component={Role} />
                <Route path='/userRole' exact component={userRole} />
            </Switch>
            </Content>
            </Layout>
        </HashRouter>
        
    }
}
export default App;