<template>
  <article class="container-fluid">
    <form>
      <section class="form-group">
        <label for="loginMail">Email:</label>
        <input class="form-control" id="loginMail" type="email" v-model="mail">
        <br>
        <label for="loginPass">Password:</label>
        <input class="form-control" id="loginPass" type="password" v-model="pass">
      </section>

      <button type="button" class="btn btn-primary" @click="submitLogin(mail, pass)">Login</button>
    </form>
  </article>
</template>

<script>
export default {
  data() {
    return {
      mail: null,
      pass: null
    };
  },

  methods: {
    submitLogin(mail, pass) {
      this.$axios.get('http://localhost:8085/api/user/auth', {
      params: {
        email: mail,
        password: pass
      }
    })
    }
  },

};


</script>

<style>
</style>
