import { Card, Icon, Image } from 'semantic-ui-react'
import SignIn from '../src/component/SignIn';
function signIn(data){

  return (
    
    <>
    <SignIn props={data}></SignIn>
    </>
    
  )
}


export default signIn;
export async function getServerSideProps(context) {
  const res = await fetch('http://localhost:8080/signIn')
  const data = await res.json()
  return {
    props: {
      item: data
    }, 
  }
}
