<template>
  <div>

  </div>
</template>

<script>
import {reactive, ref, watch} from "vue";

export default {
  setup() {
    const x = ref(0);
    const y = ref(0);

    const obj = reactive({
      count: 0,
    });

    // watch([x,y], ([newX, newY]) => {
    //   console.log(newX, newY);
    // });

    // console.log(typeof obj.count);

    // watch(
    //     () => obj.count,
    //     (newValue, oldValue) => {
    //       console.log('newValue: ', newValue);
    //       console.log('oldValue: ', oldValue);
    //     });

    // watch(obj,
    //     (newValue, oldValue) => {
    //       console.log("newValue: ", newValue);
    //       console.log("oldValue: ", oldValue);
    //     });

    const person = reactive({
      name: "gildong",
      age: 30,
      hobby: "health",
      obj: {
        count: 0,
      },
    });

    // watch(person,
    //     (newValue) => {
    //       console.log("newValue: ", newValue);
    // });

    return {x, y, obj, person};
  },
};
</script>

<style lang="scss" scoped>

</style>