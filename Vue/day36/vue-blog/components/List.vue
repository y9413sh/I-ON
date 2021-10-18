<template>
<div>
    <div>
        <h5>{{blog[0].title}}</h5>
        <p>{{blog[0].date}}글 올린 날짜</p>
    </div>
</div>
</template>

<script>
export default {
    name: 'List',
    data() {
        return {

        }
    },
    props: {
        blog : Array,
    }

}
</script>

<style>

</style>