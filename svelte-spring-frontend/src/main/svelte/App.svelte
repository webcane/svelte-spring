<script>
    import { onMount } from "svelte";

    let items = [];
    onMount(async function() {
       const response = await fetch("http://localhost:1234/items");
       const json = await response.json();
       items = json;
       console.log(items);
    });

export let name;
</script>

<style>
	h1 {
		color: purple;
	}
</style>

<h1>Hello {name}!</h1>
<ul>
    {#each items as {item}}
    <li><p>{item.description}</p></li>
{/each}
</ul>