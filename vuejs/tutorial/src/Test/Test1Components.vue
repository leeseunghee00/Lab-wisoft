<template>
  <h2>부모 컴포넌트</h2>
  <p>{{ childMsg }}</p>

  <Child @response="(text) => childMsg = text" />
</template>

<script setup>
import { ref } from 'vue';
import Child from "./Test1ChildComp.vue";

const childMsg = ref('자식 컴포넌트로부터 아직 메시지를 받지 못했어요!');
</script>