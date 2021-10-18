<template>
    <div>
        <Post :postdata="postdata[i]" v-for="(p, i) in postdata" v-bind:key="i" />
    </div>
</template>

<script>
import Post from './Post.vue';

export default {
    name: 'Container',
    props: {
        postdata: Array,
    },
    components: {
        Post,
    }
};
</script>

<style>

</style>