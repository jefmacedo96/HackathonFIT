import React from 'react';
import {BrowserRouter, Switch,Route } from "react-router-dom";

import Header from "./Components/Header/index.js"
import Home from "./Pages/Home"
import CadastrarUsuario from './Pages/cadastrarUsuario';
import Produtos from './Pages/Produtos'
import Agricutores from './Pages/Agricutores'
import Empresas from './Pages/Empresas'


function Routes () {
    return (

    <BrowserRouter>
            
            <Header/>
            <Switch>
                <Route  path="/" component={Home} exact />  
                <Route  path="/CadastrarUsuario" component={CadastrarUsuario} exact />  
                <Route  path="/Produtos" component={Produtos} exact />  
                <Route  path="/Agricutores" component={Agricutores} exact />   
                <Route  path="/Empresas" component={Empresas} exact />              
            </Switch>
    </BrowserRouter>
    );
}

export default Routes;




