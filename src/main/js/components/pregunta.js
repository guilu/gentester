import React from "react";

const Pregunta = ({imagen, titulo, texto}) => {

    return (
        <div className="card" style="width: 18rem;">
            <img src={imagen} className="card-img-top" alt="imagen de la pregunta"/>
                <div className="card-body">
                    <h5 className="card-title">{titulo}</h5>
                    <p className="card-text">{texto}</p>
                </div>
        </div>
    );
}
export default Pregunta;