<template>
  <h1>{{ message }}</h1>
  <p>숫자 세기: {{ counter.count }}</p>
</template>

<script setup>
import { reactive, ref } from 'vue';

const counter = reactive({ count: 0 });
const message = ref('안녕 Vue!');
</script>