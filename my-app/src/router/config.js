import Loadable from 'react-loadable'
import Loading from '../components/Loading';

global._Dashboard = Loadable({
  loader: () => import('../page/Dashboard'),
  loading: Loading,
})

global._Document = Loadable({
  loader: () => import('../page/Document'),
  loading: Loading,
})

global._AboutMe = Loadable({
  loader: () => import('../page/AboutMe'),
  loading: Loading,
})
