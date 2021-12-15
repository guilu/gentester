const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = { bloques: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/bloques'}).done( response => {
            this.setState({bloques: response.entity._embedded.bloques});
        })
    }

}