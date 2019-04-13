<template>
  <div id="app">
    <app-header></app-header>
    <div class="row">
      <div class="col-sm-2"></div>
      <div class="col">
        <div class="main-page">
          <router-view></router-view>
        </div>
      </div>
      <div class="col-sm-2"></div>
    </div>
  </div>
</template>

<script>
import Header from "./assets/components/Header.vue";

export default {
  components: {
    appHeader: Header
  },

  name: "app",
  data() {
    return {};
  }
};
</script>

<style>
.main-page{
  margin-top: 2%;
}

</style>
