<template>
  <p>할 일 id: {{ todoId }}</p>
  <button @click="todoId++">다음 할 일 가져오기</button>
  <p v-if="!todoData">로딩...</p>
  <pre v-else>{{ todoData }}</pre>
</template>

<script setup>
  import { ref, watch } from "vue";

  const todoId = ref(1);
  const todoData = ref(null);

  async function fetchData() {
      todoData.value = null;
      const res = await fetch(
          `https://jsonplaceholder.typicode.com/todos/${todoId.value}`
      );
    todoData.value= await res.json();
  }

  fetchData();

  watch(todoId,  fetchData);
</script>