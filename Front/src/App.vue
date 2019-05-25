<template>
  <div id="app">
    <app-header></app-header>
    <article class="row">
      <section class="col-sm-2">
        <app-menu></app-menu>
      </section>
      <section class="col main-page">
          <router-view></router-view>
      </section>
      <section class="col-sm-2"></section>
    </article>
  </div>
</template>

<script>
import Header from "./assets/components/Header.vue";
import Menu from "./assets/components/Menu.vue"

export default {
  components: {
    appHeader: Header,
    appMenu: Menu,
  },

  name: "app",
  data() {
    return {};
  }
};
</script>
