import Home from './pages/home/Home.vue';
import Login from './pages/login/Login.vue';
import NewPost from './pages/posts/NewPost.vue'

export default [
    //Homepage
    {path: '/', name: 'home', component: Home},
    //Login
    {path: '/login', name: 'login', component: Login},
    //Posts
    {path: '/posts/new', name: 'single-post', component: NewPost},

]