import { createStore } from 'vuex'

const store = createStore({
    state() { // 데이터 보관 장소
        return {
            likes: 0,
            isLike : false,
        }
    },
    mutations: {
        likes(state) {
            if(state.isLike == false) {
                state.likes++;
                state.isLike=true;
            } else {
                state.likes--;
                state.isLike=false;
            }
        }
    },
    actions: {
        
    }
})

export default store;