<template>
  <div>
    <p>author: {{ author }}</p>
    <p>title: {{ title }}</p>
  </div>
</template>

<script>
import {reactive, toRef} from "vue";

export default {
  setup() {
    const book = reactive({
      author: "Vue Team",
      year: "2023",
      title: "Vue 3 Guide",
      description: "당신은 지금 바로 이 책을 읽습니다",
      price: "무료",
    });

    // 방법1
    // const {author, title} = toRefs(book);

    // 방법2
    const author = toRef(book, "author");
    const title = toRef(book, "title");

    return {
      author,
      title,
      book,
    };
  },
};
</script>

<style lang="scss" scoped>

</style>