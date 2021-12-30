import './App.css';
import Nav from './components/Nav';
import Main from './components/Main';
import axios from "axios";
import { Grid, Box ,Grommet } from 'grommet';

axios.defaults.baseURL = process.env["REACT_APP_BASE_URL"];

function App() {
  return (
    <Grommet plain>
      <Grid
        columns={['small', 'flex']}
        rows={['flex']}

        areas={[
          { name: 'nav', start: [0, 0], end: [0, 0] },
          { name: 'main', start: [1, 0], end: [1, 0] },
        ]}
      >
        <Box gridArea="nav" background="dark-1">
          <Nav backgroundColor="dark-1" clickedColor="brand" hoverColor="dark-5"/>
        </Box>
        <Box gridArea="main" background="light-2">
          <Main bodyColor="light-2" consoleColor="dark-1" hoverColor="dark-5"/>
        </Box>
      </Grid>
    </Grommet>
  )
}

export default App;
