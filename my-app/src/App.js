import logo from './logo.svg';
import './App.css';
import Operations from './components/Operations';
import Form from './components/Form';

function App() {
  return (
    <div className="App">
      <header className="App-body">
        {/*<img src={logo} className="App-logo" alt="logo" />*/}
        <Operations />
        <Form />
      </header>
    </div>
  );
}

export default App;
