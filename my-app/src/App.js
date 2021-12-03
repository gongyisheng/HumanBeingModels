import logo from './logo.svg';
import './App.css';
import Form from './components/Form';
import axios from "axios";

axios.defaults.baseURL = process.env["REACT_APP_BASE_URL"];

function App() {
  return (
    <div className="App">
      <header className="App-body">
        <img src={logo} className="App-logo" alt="logo" />
        <Form />
      </header>
    </div>
  );
}

export default App;
