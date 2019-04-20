<template>
  <nav class="navbar navbar-expand-sm main-topbar row">
    <div class="logo-nav col-sm-2">
      <div class="navbar-brand">
        <router-link to="/">
        <img class="logo" src="../../assets/images/Logo64.png" alt="Logo">
        </router-link>
      </div>
    </div>
    <div class="vazio col-sm-9"></div>
    <div class="login col-sm-1" >
      <router-link to="login" style="float: right;">
        <button class="btn btn-iformantes btn-if1">Login</button>
        </router-link></div>
  </nav>
</template>

<script>
export default {
  data() {
    return {};
  }
};
</script>
