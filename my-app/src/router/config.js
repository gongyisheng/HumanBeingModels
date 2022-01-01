import Loadable from 'react-loadable'
import Loading from '../components/Loading';

global._Dashboard = Loadable({
  loader: () => import('../page/Dashboard'),
  loading: Loading,
  render(loaded, props){
    let Component = loaded.default;
    //console.log(props);
    return (<Component data={props.data}/>);
  }
})

global._Document = Loadable({
  loader: () => import('../page/Document'),
  loading: Loading,
})

global._AboutMe = Loadable({
  loader: () => import('../page/AboutMe'),
  loading: Loading,
})
