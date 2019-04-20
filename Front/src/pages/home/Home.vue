<template>
  <article class="container">
    <div v-for="(card, i) in cards" :key="i">
      <section class="card">
        <section class="card-body">
          <h4 class="card-title">{{card.title}}</h4>
          <hr>
          <p v-if="card.body" class="card-text">{{bodyFormatter(card.body)}}</p>
          <br>
          <router-link :to="'/post/' + card.id">
            <button class="btn btn-link btn-iformantes">Ler mais</button>
          </router-link>
        </section>
      </section>
      <br>
    </div>
  </article>
</template>

<script>
export default {
  data() {
    return {
      cards: [
        {
          id: 22,
          title: "O primeiro post",
          body: "Post exemplo"
        },
        {
          id: 12,
          title: "O segundo post"
        },
        {
          id: 41,
          title: "O terceiro post"
        },
        {
          id: 1,
          title: "O quarto post"
        }
      ]
    };
  },

  methods: {
    bodyFormatter(string) {
      return string.slice(0, 100) + "...";
    }
  }
};
</script>
