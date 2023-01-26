<template>
  <h2>부모 컴포넌트</h2>
  <p v-if='toggle'>hi</p>
  <p v-else>bye</p>
  <Child @toggle='toggle = !toggle'/>
</template>

<script setup>
import { ref } from 'vue';
import Child from "./Test2ChildComp.vue";

const toggle = ref(false);

</script>