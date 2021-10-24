<template>
<div>
  <div class="header">
    <ul class="header-button-left">
      <li>Cancel</li>
    </ul>
    <ul class="header-button-right">
      <li v-if="step==1" @click="step++">Next</li>
      <li v-if="step==2" @click="publish">발행</li>
    </ul>
    <img src="./assets/logo.png" class="logo" />
  </div>

   <h4>반가워요 {{ $store.state.name }} &nbsp; {{ $store.state.age }}  </h4>
   <!-- <button @click="$store.state.name = '강감찬' " > 이름 변경</button>
   store.js에 있는 state변경은 위에 처럼 하면 안된다. -->
    <button @click="$store.commit('namechange')" > 이름 변경</button>
    <button @click="$store.commit('ageinc', 10)" > 나이증가</button>
  <!-- Get 요청: 데이터 서버에서 가져올때
  Post 요청: 서버로 데이터를 보낼때 -->
  
   <!-- @이벤트명="mywrite = @event" -->
  <Container :choicefilter="choicefilter" @mywrite="mywrite = $event"  :postdata="postdata" :step="step" :myimage="myimage" />
  <button @click="more">더보기</button>

  <!-- 파일 업로드 기능 넣기 -->
  <div class="footer">
    <ul class="footer-button-plus">
      <input @change="upload" multiple accept="image/*" type="file" id="file" class="inputfile" />
      <label for="file" class="input-plus">+</label>
    </ul>
 </div>
</div>
 <!-- 동적인 UI만드는 법
 1.UI 현재 상태를 데이터로 만들기
 2.상태에 따라 HTML이 어떻게 보일지... -->

  <!-- <div v-if="step == 0">content0</div>
  <div v-if="step == 1">content1</div>
  <div v-if="step == 2">content2</div>
  <button @click="step = 0">button0</button>
  <button @click="step = 1">button1</button>
  <button @click="step = 2">button2</button>
  <div style="margin-top:500px;"></div> -->

</template>

<script>
import postdata from './assets/postdata.js';
import Container from './components/Container.vue';
import axios from 'axios';
export default {
  name: 'App',
  data(){
    return {
      postdata : postdata,
      morecount : 0,
      step: 0,
      myimage: '',
      mywrite: '',  // 작성한글 저장 공간
      choicefilter: '',
    }
  },
  mounted(){
    // this.emitter.on('name', (a)=>{
    //     console.log(a);
    // });
    this.emitter.on('boxclick', (a)=>{
        this.choicefilter = a;
        // console.log(a);
    });
  },
  methods: {
    publish() {
      var myboard = {
          name: "Kim Hyun",
          userImage: "https://placeimg.com/100/100/arch",
          postImage: this.myimage, //"내가 업로드한 이미지 URL",
          likes: 36,
          date: "May 15",
          liked: false,
          content: this.mywrite,  //"내가 입력한 글",
          filter: this.choicefilter //"내가 선택한 필터적요"
        };
      // var myboard ={};
       this.postdata.unshift(myboard);
       this.step=0;
    },
    upload(e) {
      let file = e.target.files;
      // console.log(file[0]);
      let url = URL.createObjectURL(file[0])
      console.log(url);
      this.myimage = url;
      this.step++;
        // 1.FileReader() - 텍스트로 압축해준다(텍스트로 변환)
        // 2.URL.createObjectURL() - 이미지의 가상 URL을 생성해줌. 
    },
    more() {
        // axios.post('URL', {name:'doyeon'}).then().catch((err)=>{
        //   err
        // });
          // axios.get('https://raw.githubusercontent.com/ai-edu-pro/busan/main/more1.json')
          //   // .then(function(result){
          //   .then(result=> {
          //      console.log(result.data); 
          //      this.postdata.push(result.data);
          //   })
            // .catch(function(err){
            //   예외(에러)발생하면 처리할 내용
            // })
            axios.get(`https://raw.githubusercontent.com/ai-edu-pro/busan/main/more${this.morecount}.json`)
              .then( result => {
                this.postdata.push(result.data);
                this.morecount++;
            })
      // axios.get('url')
      // .then(function(){
      //   정상처리되면 처리할 내용
      // })
      // .catch(function(){
      //   예외(에러)발생하면 처리할 내용
      // })
    }
  },
  components: {
    Container,
  }
}
</script>

<style>
body {
  margin: 0;
}
ul {
  padding: 5px;
  list-style-type: none;
}
.logo {
  width: 22px;
  margin: auto;
  display: block;
  position: absolute;
  left: 0;
  right: 0;
  top: 13px;
}
.header {
  width: 100%;
  height: 40px;
  background-color: white;
  padding-bottom: 8px;
  position: sticky;
  top: 0;
}
.header-button-left {
  color: skyblue;
  float: left;
  width: 50px;
  padding-left: 20px;
  cursor: pointer;
  margin-top: 10px;
}
.header-button-right {
  color: skyblue;
  float: right;
  width: 50px;
  cursor: pointer;
  margin-top: 10px;
}
.footer {
  width: 100%;
  position: sticky;
  bottom: 0;
  padding-bottom: 10px;
  background-color: white;
}
.footer-button-plus {
  width: 80px;
  margin: auto;
  text-align: center;
  cursor: pointer;
  font-size: 24px;
  padding-top: 12px;
}
.sample-box {
  width: 100%;
  height: 600px;
  background-color: bisque;
}
.inputfile {
  display: none;
}
.input-plus {
  cursor: pointer;
}
#app {
  box-sizing: border-box;
  font-family: "consolas";
  margin-top: 60px;
  width: 100%;
  max-width: 460px;
  margin: auto;
  position: relative;
  border-right: 1px solid #eee;
  border-left: 1px solid #eee;
}
</style>