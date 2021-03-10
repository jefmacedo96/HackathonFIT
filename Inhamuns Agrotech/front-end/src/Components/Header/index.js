import React from 'react';
import { Navbar, Nav, Form, Button,Image } from "react-bootstrap";
import { Link } from 'react-router-dom';

import "./styles.css";
import logo from "../../assets/img/logo.png";

export default function Header() {

    return (
        <Navbar bg="light" expand="lg" className="mainHeader">
             <Image src={logo} alt="Logo" style={{ objectFit: "cover", width: "300px", height: "40px", marginLeft: "15px" }} />
            <Navbar.Toggle />
            <Navbar.Collapse className=" justify-content-end" >
                <Nav>
                <Link to = "/"><Nav.Link href="#home">Home</Nav.Link></Link>
                <Link to = "/Produtos"><Nav.Link href="#produtos">Produtos</Nav.Link></Link>
                <Link to = "/Agricutores">   <Nav.Link href="#agricutores">Agricutores</Nav.Link></Link>
                <Link to = "/Empresas">   <Nav.Link href="#produtos">Empresas</Nav.Link></Link>
                <Link to = "/CadastrarUsuario">  <Button variant="outline-success">Cadastre-se</Button></Link>
                    <Nav.Link href="#home">Login</Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
    );
}