<template>
  <p ref="p">안녕</p>
</template>

<script setup>
import { ref, onMounted } from 'vue';

const p = ref(null);

onMounted(() => {
  p.value.textContent = '마운트 되었어요!'
});
</script>