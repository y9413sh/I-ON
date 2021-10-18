import { createWebHashHistory, createRouter } from "vue-router";
import List from '../components/List.vue';
import Home from '../components/Home.vue';
import Detail from '../components/Detail.vue';
import Author from '../components/Author.vue';
import Comment from '../components/Comment.vue';
import Error from '../components/Error.vue';

const routes = [
    {
         path: "/detail/:id", //url의 파라미터 문법
        // path: "/detail/:id(\\d+)", // 정규식 표현도 가능 - 숫자만
        // path: "/detail/:id*", // 중복 가능
        component: Detail,
        children: [
            {
                path: "author",
                component: Author
            }, {
                path: "comment",
                component: Comment
            }
        ]
    },
    {
        path: "/list",
        component: List,
    }, 
    {
        path: "/",
        component: Home,
    }, {
        // path: "/:asdmgioanbsdivsdv" 이상한 문자가 들어오면
        path: "/:anything(.*)", // 모든 문자가 들어오면
        component: Error,
    },
];

const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

export default router;

//import { createWebHashHistory, createRouter } from "vue-router";

// const routes = [
//     {
//         path: "/경로",
//         component: import 해온 컴포넌트,

//     }, {

//     },

// ];

// const router = createRouter({
//     history: createWebHashHistory(),
//     routes,
// });