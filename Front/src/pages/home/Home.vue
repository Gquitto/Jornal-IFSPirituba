<template>
  <div class="container">
        <div class="card" v-for="(card, i) in cards" :key="i">
          <div class="card-header">{{card.title}}</div>
          <div class="card-body">{{card.body}}</div>
      <!-- This will be the center part of the site -->
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      cards: [
        {
          title: "O dia que eu comi o seu cú",
          body: "Sua tia velha"
        }
      ]
    };
  }
};
</script>

<style>
.main-blog {
  background-color: blue;
}
</style>
