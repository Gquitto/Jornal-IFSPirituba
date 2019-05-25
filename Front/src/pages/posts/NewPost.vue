<template>
  <article class="container">
    <div class="form-new card">
      <form name="NewPostForm" class="form-group container">
        <label for="title">Title: </label>
        <input class="form-control" type="text" id="title" v-model="newPost.title" required>
        <br>
        <label for="desc">Description: </label>
        <textarea class="form-control" rows="10" maxlength="400" v-model="newPost.body" required></textarea>
        <p class="max-chars">Max chars: {{maxChar(this.newPost.body.length)}}</p>
       <button class="btn btn-iformantes btn-if1" type="button" @click="a()" style="margin-top: 2%">
          Submit
        </button>
      </form>
    </div>
  </article>
</template>

<script>
export default {
  data() {
    return {
      newPost: {
        title: "",
        body: "",
      }
    }
  },
  methods: {
    maxChar(chars) {
      return 400 - chars
    },

    clear() {
      this.newPost = {
        title: "",
        body: "",
      }
    },

    a(){
      
      this.$axios.post('http://localhost:8085/api/post/saveNew', this.newPost);
    }
  },
};
</script>

<style>
.max-chars {
  float: right;
  font-size: 14px;
}
</style>
