<template>
 <div>
   <h2>자식 컴포넌트</h2>
   <button @click="emit('toggle')">토글 버튼</button>
 </div>
</template>

<script>
const emit = defineEmits(['toggle']);
</script>
