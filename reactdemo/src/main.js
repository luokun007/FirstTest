
import './css/index.css';
import './css/main.less';
import React from 'react';
import ReactDOM from 'react-dom';
import {Provider} from 'react-redux';
import App from './antd/app';


import { LocaleProvider } from 'antd';
import zhCN from 'antd/es/locale-provider/zh_CN';

import 'antd/dist/antd.css';

ReactDOM.render(
    <LocaleProvider locale={zhCN}>
    
    <App />
    
    </LocaleProvider>,
    document.getElementById('app')
);