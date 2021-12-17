import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import Bloque from "./components/bloque";

const App = () => {
    const [error, setError] = useState(null);
    const [isLoaded, setIsLoaded] = useState(false);
    const [bloques, setBloques] = useState([]);

    useEffect( () => {

        fetch("http://localhost:3001/api/v1/bloques")
            .then(res => res.json())
            .then(
                (result) => {
                    setIsLoaded(true);
                    setBloques(result._embedded.bloques);
                },
                // Nota: es importante manejar errores aquí y no en
                // un bloque catch() para que no interceptemos errores
                // de errores reales en los componentes.
                (error) => {
                    setIsLoaded(true);
                    setError(error);
                }
            )
    }, [])

    if (error) {
        return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
        return <div>Loading...</div>;
    } else {
        return (
            <ul>
                {bloques.map(bloque => (
                    <Bloque key={bloque.id} texto={bloque.texto}/>
                ))}
            </ul>
        );
    }

}

ReactDOM.render(
    <App/>,
    document.getElementById('react')
)
