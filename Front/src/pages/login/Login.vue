<template>
  <div class="container-fluid">
    <form>
      <div class="form-group">
        <label for="loginMail">Email:</label>
        <input class="form-control" id="loginMail" type="email" v-model="mail">
      </div>
      <div class="form-group">
        <label for="loginPass">Password:</label>
        <input class="form-control" id="loginPass" type="password" v-model="pass">
      </div>
      <button type="button" class="btn btn-primary" @click="submitLogin(mail, pass)">Login</button>
    </form>
  </div>
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
      console.log(mail, pass);
    }
  }
};
</script>

<style>
</style>
