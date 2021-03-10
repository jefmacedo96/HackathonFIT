import React, { useState, useEffect } from "react";
import { Container, Navbar, Table } from "react-bootstrap";
import api from '../../Services/Api'

import "./style.css";

export default function Agricutores() {


    const [Agricultores, setAgricultores] = useState([]);

    useEffect(() => {

        async function GetListAgricultor() {
            const response = await api.get("agricultor");
            setAgricultores(response.data);

        }
        GetListAgricultor();
    }, []);

    return (

        <Container fluid="sm" className="MainContainer">

            <Navbar className="Navigation">
                <Navbar.Brand> <h4> Agricultores </h4></Navbar.Brand>
            </Navbar>
            { Agricultores.map((a) => (
                <div key={a.id} >
                    <Table responsive hover className="TableActivities">
                        <thead>
                            <tr style={{ background: 'white' }} >

                                <th>Nome </th>
                                <th>RegistroRural  </th>
                                <th>Endereço </th>
                                <th>Telefone </th>
                            </tr>
                        </thead>

                        <tbody>

                            <tr>
                                <td>{a.nome}</td>
                                <td>{a.registroRural}</td>
                                <td>{a.endereco}</td>
                                <td>{a.telefone}</td>
                            </tr>

                        </tbody>

                    </Table>
                </div>
            ))}

        </Container>
    )
}

