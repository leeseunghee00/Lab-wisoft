<template>
  <div>
    <h2>자식 컴포넌트</h2>
    <input v-model="text" placeholder="입력">
    <button @click="emit('response', text)">확인</button>
  </div>
</template>

<script setup>
import {ref} from 'vue';

const text = ref('');
const emit = defineEmits(['response']);

</script>