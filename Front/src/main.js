import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router';
import Routes from './routes.js'
import Axios from 'axios'

import "./assets/styles/styles.css"

Vue.use(VueRouter)
Vue.prototype.$axios = Axios

const router = new VueRouter ({
  routes: Routes,
  mode: 'history'
})

new Vue({
  el: '#app',
  render: h => h(App),
  router: router
})
