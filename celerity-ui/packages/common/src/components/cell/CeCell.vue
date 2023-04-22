<template>
  <div class="cell">
    <slot></slot>
  </div>
</template>
<script>

</script>
<style lang="scss">
.cell {
  font-size: 14px;
  width: max-content;
  //width: 100%;
  max-width: 400px;
  max-width: 464px;
  position: relative;
  display: flex;
  flex-direction: row;
  flex-wrap: nowrap;
  align-items: center;
}
</style>
