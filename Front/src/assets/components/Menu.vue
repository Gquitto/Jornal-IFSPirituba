<template>
  <div class="side-menu">
    <div class="menu-items" v-for="(item, i) in menuItems" :key="i">
      <div class="menu-item">
        <router-link to="/posts/new">
          <span class="core link">{{item.name}}</span>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      menuItems: [
        { name: "Novo", link: "/posts/new" },
        { name: "IFSP Pirituba", link: "TODO" },
        { name: "Posts antigos", link: "TODO" },
        { name: "1", link: "TODO" },
        { name: "2", link: "TODO" },
        { name: "3", link: "TODO" }
      ]
    };
  }
};
</script>

<style>
.menu-item {
  padding: 5% 10% 5% 10%;
  border-bottom: .1px solid rgb(214, 214, 214);
  border-top: .1px solid rgb(214, 214, 214);
}
</style>
