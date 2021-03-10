import React, { useState, useEffect } from "react";
import { Container, Navbar, Button, Table } from "react-bootstrap";
import api from '../../Services/Api'

import "./style.css";

export default function Produtos() {

    const [produtos, setProdutos] = useState([]);

    useEffect(() => {

        async function GetListProdutos() {
            const response = await api.get("produto");
            setProdutos(response.data);

        }
        GetListProdutos();
    }, []);


    return (

        <Container fluid="sm" className="MainContainer">

            <Navbar className="Navigation">
                <Navbar.Brand> <h4> Produtos </h4></Navbar.Brand>
            </Navbar>

            { produtos.map((p) => (
                <div key={p.id} >

                    <Table responsive hover className="TableActivities">
                        <thead>
                            <tr style={{ background: 'white' }} >

                                <th>Descrição </th>
                                <th>Preço </th>
                                <th>tipo</th>

                            </tr>
                        </thead>
                        <tbody>
                            <tr>

                                <td>{p.nome}</td>
                                <td>{p.valorUnitario}</td>
                                <td>{p.tipo}</td>

                            </tr>
                        </tbody>
                    </Table>
                </div>
            ))}



        </Container>
    )
}

