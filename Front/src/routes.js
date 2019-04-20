import Home from './pages/home/Home.vue';
import Login from './pages/login/Login.vue';
import SinglePost from './pages/post/SinglePost.vue'

export default [
    //Homepage
    {path: '/', name: 'home', component: Home},
    //Login
    {path: '/login', name: 'login', component: Login},
    //Posts
    {path: '/post/:id', name: 'single-post', component: SinglePost},

]