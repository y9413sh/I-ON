<template>
  <div>
    <form v-on:submit.prevent="submitForm">
      <!-- <form v-on:submit="submitForm"> -->
      <div>
        <label for="username">ID: </label>
        <input type="text" id="username" class="username-input" v-model="username" v-bind:class="{'error': isError}">
      </div>
      <div>
        <label for="password">PW: </label>
        <input type="password" id="password" v-model="password">
      </div>
      <button v-bind:disabled="!isUsernameValid" type="submit">로그인</button>
    </form>
    <!-- <p v-if="isError">올바르지 않은 ID 입니다.</p> -->
    <p v-if="isUsernameValid">아이디가 이메일 형식이 맞습니다.</p>
    <p v-if="isSuccess">로그인이 되었습니다.</p>

    <!-- <toast-popup v-bind:open="isSuccess"></toast-popup> -->
    <ToastPopup v-bind:open="isSuccess" v-on:close="isSuccess = false"></ToastPopup>
  </div>
</template>

<script>
  // import ToastPopup from '@/components/ToastPopup.vue';
  import ToastPopup from './components/ToastPopup.vue';

  // 이메일에 대한 유효성 검사
  function validateEmail(email) {
    const re =
      /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
  }

  export default {
    components: {
      ToastPopup
    },
    data() {
      return {
        username: '',
        password: '',
        isError: false,
        isSuccess: false
      }
    },
    computed: {
      isUsernameValid() {
        if (validateEmail(this.username)) {
          this.isError = false;
          return true;
        } else {
          this.isError = true;
          return false;
        }
        // return validateEmail(this.username);
      }
    },
    methods: {
      submitForm() {
        // submitForm(event) {
        // event.preventDefault();
        console.log('로그인');
        // axios
        //   .post()
        //   .then()
        //   .catch(error => {
        //     this.isError = true;
        //   });

        this.isError = false;
        this.initForm();
      },
      initForm() {
        this.username = '';
        this.password = '';
        this.isSuccess = true;
      }
    }
  }
</script>

<style>
  .username-input.error {
    border: 1px solid red;
  }
</style>