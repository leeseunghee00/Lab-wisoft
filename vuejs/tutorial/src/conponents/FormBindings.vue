<template>
  <input v-model="text" placeholder="여기에 입력하기">
  <p>{{ text }}</p>
</template>

<script setup>
import { ref } from 'vue';

const text = ref('');
</script>