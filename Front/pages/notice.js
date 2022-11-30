function notice({item}){
  return (
    <>
    adasdalkdm  
      {console.log(item)}
    </>
  )
}


export default notice;


export async function getServerSideProps(context) {
  const res = await fetch('https://jsonplaceholder.typicode.com/todos/1')
  
  const data = await res.json() 
  return {
    props: {
      item: data
    }, 
  }
}