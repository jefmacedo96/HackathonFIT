import React, { useState, useEffect } from "react";
import { Container, Navbar, Form, Button, Table } from "react-bootstrap";
import api from '../../Services/Api'
import "./style.css";

export default function Empresas() {

    const [empresas, setEmpresas] = useState([]);

    useEffect(() => {

        async function GetListEmpresa() {
            const response = await api.get("empresa");
            setEmpresas(response.data);

        }
        GetListEmpresa();
    }, []);

    return (

        <Container fluid="sm" className="MainContainer">

            <Navbar className="Navigation">
                <Navbar.Brand> <h4> Empresas </h4></Navbar.Brand>
            </Navbar>
           
                    <Table responsive hover className="TableActivities">
                        <thead>
                            <tr style={{ background: 'white' }} >

                                <th>Nome </th>
                                <th>CNPJ </th>
                                <th>Endereço </th>
                                <th>Telefone </th>

                            </tr>
                        </thead>
                        <tbody>
                            <tr>

                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>

                            </tr>
                        </tbody>
                    </Table>
             

        </Container>
    )
}

