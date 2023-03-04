<template>
  <div>
    <input type="text" @keyup.ctrl.enter="addTodo"/>
    <ul>
      <li v-for="(todo, index) in todos" :key="index">
        {{ todo }}
      </li>
    </ul>
  </div>
</template>

<script>
import {reactive} from "vue";

export default {
  setup() {
    const todos = reactive([]);

    const addTodo = e => {
      console.log("event.key", e.key);
      e.target.value = "";
      e.target.focus();
    };
    return {todos, addTodo};
  },
};
</script>

<style lang="scss" scoped>

</style>