<template>
  <button @click="increment">숫자 세기: {{ count }}</button>
</template>

<script setup>
import { ref } from 'vue';

const count = ref(0);

function increment() {
  count.value++;
}
</script>
