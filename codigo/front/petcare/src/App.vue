<template>
  <div id="app">
    <section class="navbar-section">
      <router-link to="/pet" class="btn btn-link">Pet</router-link>
      <router-link to="/comanda" class="btn btn-link">Comanda</router-link>
    </section>
    <router-view />
    <div id="btnPet">
      <!-- <router-link to="/pet" class="btn btn-link" >Pet</router-link> -->
    </div>
  </div>
</template>

<script>
export default {
  name: "App",
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
