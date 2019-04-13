<template>
  <nav class="navbar navbar-expand-sm main-topbar row">
    <div class="logo-nav col-sm-2">
      <div  class="navbar-brand">
        <router-link to="/">LOGO</router-link>
      </div>
    </div>
    <div class="vazio col-sm-9"></div>
    <div class="login col-sm-1" >
      <router-link to="login">Login</router-link></div>
  </nav>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {
  }
};
</script>

<style>
.main-topbar {
  background-color: green;
}
</style>
