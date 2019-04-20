<template>
  <div id="app">
    <app-header></app-header>
    <article class="row">
      <section class="col-sm-2"></section>
      <section class="col main-page">
          <router-view></router-view>
      </section>
      <section class="col-sm-2"></section>
    </article>
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
