<template>
  <h2>Child component</h2>
</template>

<script>
export default {
  emits: ['response'],
  created() {
    this.$emit('response', 'hello from child')
  }
}
</script>